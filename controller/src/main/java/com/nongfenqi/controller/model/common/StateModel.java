package com.nongfenqi.controller.model.common;

import java.io.Serializable;

/**
 * 基本的state模型
 *
 * @author jiezhi
 * @version 1.0, 01/04/2017
 * @since [sherlock/V1.0.0]
 */
public class StateModel implements Serializable {
    /**
     * id : 0
     * name : string
     */

    private Integer id;
    private String name;

    private StateModel(Builder builder) {
        setId(builder.id);
        setName(builder.name);
    }

    public StateModel() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StateModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static final class Builder {
        private Integer id;
        private String name;

        public Builder() {
        }

        public Builder withId(Integer val) {
            id = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public StateModel build() {
            return new StateModel(this);
        }
    }
}
