package docgenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by chandresh.pancholi on 12/04/16.
 */
public class DocGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean primaryClass = true;
        Claz claz = docGenerator(sc, primaryClass);
        System.out.println(claz.toString());
    }

    public static Claz docGenerator(Scanner sc, boolean primaryClass ) {
        Claz claz = new Claz();

        String line ;

        while (sc.hasNext()) {
            line = sc.nextLine().trim();

            if (line.contains("@class ")) {
                claz.setDescription(line.substring(line.indexOf("@class") + 6).trim());
            } else if (line.contains("@author")) {
                claz.setAuthor(line.substring(line.indexOf("@author") + 7).trim());
            } else if (line.startsWith("class ") && primaryClass) {
                String[] classes = line.split(" ");

                claz.setClazName(classes[1].replace(":",""));

                if (line.contains(":")) {
                    String[] superClasses = line.substring(line.indexOf(":") + 1).split(",");

                    for (String superClass : superClasses) {
                        claz.addSuperClass(superClass.trim().split(" ")[1]);
                    }
                }

                primaryClass = false;
            } else if (line.contains("@var")) {
                Property property = new Property();
                property.setDesc(line.substring(line.indexOf("@var") + 4).trim());

                line = sc.nextLine().trim();

                property.setType(line.split(" ")[0]);
                property.setVar(line.split(" ")[1].replace(";", ""));

                claz.addProperty(property);
            } else if (line.contains("@method")) {
                Method method = new Method();

                method.setDescription(line.substring(line.indexOf("@method") + 7).trim());

                List<String> lisData = new ArrayList<>();

                while (!(line = sc.nextLine().trim()).endsWith(");")) {
                    lisData.add(line);
                }

                String methodStructure = line.substring(0, line.indexOf("("));
                String[] splitMethod = methodStructure.split(" ");

                int i = 0;

                if (splitMethod[0].equalsIgnoreCase("virtual")) {
                    method.setVirtual(true);
                    i++;
                }

                method.setReturnType(splitMethod[i++]);
                method.setMethodName(splitMethod[i]);

                String[] parameters = line.substring(line.indexOf("(") + 1, line.lastIndexOf(")")).split(",");

                i = 0;

                for (String str : lisData) {
                    if (str.contains("@param")) {
                        Parameter parameter = new Parameter();
                        parameter.setDesc(str.substring(str.indexOf("@param") + 6).trim());

                        String[] p = parameters[i].replaceAll(" +", " ").split(" ");

                        parameter.setType(p[0]+"&");
                        parameter.setVar(p[1].replace("&", ""));

                        method.addParameter(parameter);

                        i++;
                    }
                }
                claz.addMethods(method);
            } else if (line.startsWith("class ") && !primaryClass) {
                Claz subClass = docGenerator(sc, primaryClass);
                if (subClass != null)
                    subClass.addSubClass(subClass);
            } else if (line.endsWith("};"))
                return claz;
        }
        return null;
    }


}
class Property {
    private String var;
    private String type;
    private String desc;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "{" +
                "\"var\":\"" + var + "\"," +
                "\"type\":\"" + type + "\"," +
                "\"desc\":\"" + desc + "\"" +
                "}";
    }
}

class Claz {
    private String clazName;
    private String description;
    private List<String> superClasses;
    private String author;
    private List<Property> properties;
    private List<Method> methods;
    private List<Claz> subclasses;

    public Claz() {
        this.superClasses = new ArrayList<>();
        this.properties = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.subclasses = new ArrayList<>();
    }

    public String getClazName() {
        return clazName;
    }

    public void setClazName(String clazName) {
        this.clazName = clazName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSuperClass() {
        return superClasses;
    }

    public void setSuperClass(List<String> superClass) {
        this.superClasses = superClass;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<Claz> getSubclasses() {
        return subclasses;
    }

    public void setSubclasses(List<Claz> subclasses) {
        this.subclasses = subclasses;
    }

    public void addSuperClass(String className) {
        this.superClasses.add(className);
    }

    public void addMethods(Method method) {
        this.methods.add(method);
    }

    public void addProperty(Property property) {
        this.properties.add(property);
    }

    public void addSubClass(Claz subClass) {
        this.subclasses.add(subClass);
    }

    @Override
    public String toString() {
        String sc = "";
        for(String superClass: superClasses)
            sc += "\"" + superClass +"\", ";
        sc = sc.substring(0, sc.length()-2);
        return "{" +
                "\"class\":\"" + clazName + "\"," +
                "\"desc\":\"" + description + "\"," +
                "\"super\":[" + sc + "],"+
                "\"author\":\"" + author + "\"," +
                "\"properties\":" + properties + ","+
                "\"methods\":" + methods+ "," +
                "\"subclasses\":" + subclasses +
                "}";
    }
}

class Method {
    private String methodName;
    private String returnType;
    private boolean virtual;
    private String description;
    private List<Parameter> parameters;

    public Method() {
        this.parameters = new ArrayList<>();
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public void addParameter(Parameter parameter) {
        this.parameters.add(parameter);
    }

    @Override
    public String toString() {
        return "{" +
                "\"method\":\"" + methodName + "\"," +
                "\"return\":\"" + returnType +  "\"," +
                "\"virtual\":" + virtual +  "," +
                "\"desc\":\"" + description +  "\"," +
                "\"params\":" + parameters +
                "}";
    }
}

class Parameter {
    private String var;
    private String type;
    private String desc;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "{" +
                "\"var\":\"" + var + "\"," +
                "\"type\":\"" + type + "\"," +
                "\"desc\":\"" + desc + "\"" +
                '}';
    }

}


