package com.nongfenqi.controller.model.user;

import java.util.List;

/**
 * 部门
 *
 * @author luzhichao
 * @version 1.0, 17/3/25
 * @since [sherlock/V1.0.0]
 */

public class UserDeptModel {
    private List<UserDeptModel> childList;
    private DataEntity data;

    public List<UserDeptModel> getChildList() {
        return childList;
    }

    public void setChildList(List<UserDeptModel> childList) {
        this.childList = childList;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public class DataEntity {
        /**
         * id : 0
         * name : 技术部
         * parentId : 0
         * type : 0
         */

        private int id;
        private String name;
        private int parentId;
        private int type;
        private boolean isSelected;

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

        public int getParentId() {
            return parentId;
        }

        public void setParentId(int parentId) {
            this.parentId = parentId;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public void setSelected(boolean selected) {
            isSelected = selected;
        }

        public boolean getSelected() {
            return isSelected;
        }
    }
}
