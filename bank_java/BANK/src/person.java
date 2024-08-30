
public class person {
  String name;
  Integer age;
  String cpf;

  person(String name, Integer age, String cpf) {
    super();
    this.name = name;
    this.age = age;
    this.cpf = cpf;
  }

  public String getName() {
    return name;
  }

  public Integer getAge() {
    return age;
  }

  public String getCpf() {
    return cpf;
  }

}
