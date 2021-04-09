package com.ocp.day16;

import java.util.Objects;

public class Person {
    private String name;
    private Double h;
    private Double w;

    public Person() {
    }

    public Person(String name, Double h, Double w) {
        this.name = name;
        this.h = h;
        this.w = w;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getW() {
        return w;
    }

    public void setW(Double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", h=" + h + ", w=" + w + '}';
    }
        

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Person){
//            Person p = (Person) obj;
//            if(name.equals(p.name) && h.doubleValue() == p.h.doubleValue() && w.doubleValue() == p.w.doubleValue()){    // 物件型 Double 所以用 doubleValue
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return  7 * 11 * name.hashCode() * h.intValue() * w.intValue();    // 離散數學
//    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.h);
        hash = 23 * hash + Objects.hashCode(this.w);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.h, other.h)) {
            return false;
        }
        if (!Objects.equals(this.w, other.w)) {
            return false;
        }
        return true;
    }
    
    
}
