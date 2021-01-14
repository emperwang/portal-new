<template>
  <el-container>
    <el-aside style="width:200px;">
      <el-menu :collapse="isCollapse">
        <el-menu-item index="/">
          <i class="el-icon-s-home"></i>
          <span slot="title">首页</span>
        </el-menu-item>
        <el-submenu index="1">
          <template slot="title">
            <i class="el-icon-document"></i>
            <span slot="title">文章管理</span>
          </template>
          <el-menu-item index="1.1">文章列表</el-menu-item>
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
      </el-menu>
    </el-aside>

    <el-container>
      <el-header>
        <template>
          <div class="nav toggle">
            <a class="tagglemenu">
              <i class="fa fa-bars" aria-hidden="true"></i>
            </a>
          </div>
          <!-- <i class="folds el-icon-s-fold"></i> -->
        </template>
        <span>王小虎</span>
      </el-header>
      <el-main>
        <router-view />
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
export default {
  name: "App",
  data() {
    return {
      isCollapse: true
    };
  }
};
</script>

<style>
.toggle {
  float: left;
  widows: 70px;
}
.toggle a {
  display: inline-block;
  padding: 15px 15px 0;
  cursor: pointer;
}
.toggle a i {
  font-size: 26px;
}
.el-header {
  background-color: #b3c0d1;
  color: #333;
  line-height: 60px;
  text-align: right;
  font-size: 12px;
  width: 100%;
}
.folds {
  float: left;
  display: block;
  width: 50px;
  height: 60px;
}

.el-aside {
  color: #333;
  min-width: 100px;
}
</style>
