<template>
    <div>
        <div class="menu-bar-container">
            <div :class="collapse?'position-collapse-left' : 'position-left'">
                <div class="logo" @click="toIndex" :class="collapse ? 'position-collapse-left' : 'position-left'">
                    <img v-if="collapse" src="../../assets/logo.png" alt="logo">
                    <div>{{collapse?"":appName}}</div>
                </div>
            </div>
        </div>

        <el-menu :collapse="collapse" :unique-opened="true" :collapse-transition="false">
            <el-menu-item index="/">
                <i class="el-icon-s-home"></i>
                <span slot="title">首页</span>
            </el-menu-item>
            <el-submenu index="1">
                <template slot="title">
                <i class="el-icon-document"></i>
                <span slot="title">文章管理</span>
                </template>
            <el-menu-item index="1.1" >文章列表</el-menu-item>
            <el-menu-item index="1.2">标签管理</el-menu-item>
            <el-menu-item index="1.3">分类列表</el-menu-item>
          </el-submenu>
          <el-submenu index="2">
            <template slot="title">
              <i class="el-icon-user"></i>
              <span>用户管理</span>
            </template>
            <el-menu-item index="2.1">用户列表</el-menu-item>
            <el-menu-item index="2.2">角色管理</el-menu-item>
          </el-submenu>
          <el-submenu index="3">
            <template slot="title">
              <i class="el-icon-setting"></i>
              <span>权限管理</span>
            </template>
            <el-menu-item index="3.1">权限1</el-menu-item>
          </el-submenu>
          <el-submenu index="4">
            <template slot="title">
              <i class="fa fa-square icon-class"></i>
              <span>组件使用</span>
            </template>
          </el-submenu>
        </el-menu>
    </div>
</template>

<script>
import {mapState} from 'vuex'
export default {
    name:'content',
    data(){
        return {

        }
    },
    methods: {
        jumpPath(path) {
            this.$router.push(path)
        },
    },
    computed: {
        ...mapState ({
            appName: state => state.app.appName,
            collapse: state => state.app.collapse
        })
    }
}
</script>
<style lang="scss" scoped>
.menu-bar-container {
  top: 0px;
  left: 0;
  bottom: 0;
  z-index: 1020;
}
.position-left{
    width: 200px;
}
.position-collapse-left {
    width: 65px;
}
</style>
