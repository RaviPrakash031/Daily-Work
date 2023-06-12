interface Language {
  void method(String name);
  void method2(String name);
  
}
class ProgrammingLanguage implements Language {

  
  public void method(String name) {
    System.out.println("Programming Language: "+ name);
  }
  public void method2(String name){
    System.out.println("Programming Language: "+ name);
  }
}

class InterfaceProgram {
  public static void main(String[] args) {
    ProgrammingLanguage language = new ProgrammingLanguage();
    language.method("Java");
    language.method2("python");
  }
}