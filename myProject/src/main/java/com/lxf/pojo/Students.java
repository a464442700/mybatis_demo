package com.lxf.pojo;

public class Students {
    public  Students(Integer id,String name){
        this.studentId=id;
    }
    public  Students(){};
    private Integer studentId;
    private String student_name;
    private String class_name;
    private String sex;
    private Integer age;
  //按住alter+insert 选择set get 方法可以自动生成
    public Integer getstudentId() {
        return studentId;
    }

    public void setstudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", student_name='" + student_name + '\'' +
                ", class_name='" + class_name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
