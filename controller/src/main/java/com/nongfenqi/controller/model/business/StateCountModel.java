package com.nongfenqi.controller.model.business;

/**
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class StateCountModel {
    private static final String TAG = StateCountModel.class.getSimpleName();

    private int count;
    /**
     * id : 0
     * name : string
     */
    private StateEntity state;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public StateEntity getState() {
        return state;
    }

    public void setState(StateEntity state) {
        this.state = state;
    }

    public static class StateEntity {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
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
            return "StateEntity{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ApplyOrderStateCountModel{" +
                "count=" + count +
                ", state=" + state +
                '}';
    }
}
