<template>
  <el-container>
    <div class="menu-bar-container">
      <div :class="collapse ? 'position-collapse-left' : 'position-left'">
        <div class="logo" @click="toIndex()"
          :class="collapse ? 'position-collapse-left' : 'position-left'"
        >
          <img v-if="collapse" src="../assets/logo.png" />
          <div>{{ collapse ? "" : appName }}</div>
        </div>
        <el-menu :collapse="collapse" :unique-opened="true" @open="handleOpen" @close="handleClose"
        :collapse-transition="false"
        >
          <el-menu-item index="/">
            <i class="el-icon-s-home"></i>
            <span slot="title">首页</span>
          </el-menu-item>
          <el-submenu index="1">
            <template slot="title">
              <i class="el-icon-document"></i>
              <span slot="title">文章管理</span>
            </template>
            <el-menu-item index="1.1" @click="jumpPath('index/home')">文章列表</el-menu-item>
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
            <el-menu-item v-for="itm in items" :key="itm.url" :index="itm.url" 
              @click="jumpPath(itm.url,$event)">{{itm.text}}</el-menu-item>
          </el-submenu>
        </el-menu>
      </div>
    </div>

    <el-container>
      <el-header>
        <template>
          <div class="toggle">
            <a class="tagglemenu" @click="onCollapse">
              <i class="fa fa-bars" aria-hidden="true"></i>
            </a>
          </div>
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
import { mapState } from "vuex";
export default {
  name: "index",
  data() {
    return {
      items: [
        {url:"index/vbutton", text:"button组件"},
        {url:"index/vlink", text:"link组件"},
        {url:"index/vradio", text:"radio组件"},
        {url:"index/vcheckbox", text:"checkbox组件"},
        {url:"index/vinput", text:"input组件"},
        {url:"index/vinputnumber", text:"inputnumber组件"},
        {url:"index/vselect", text:"select组件"},
        {url:"index/vcascader", text:"cascader组件"},
        {url:"index/vswtch", text:"switch组件"},
        {url:"index/vslider", text:"vslider组件"},
        {url:"index/vtimepicker", text:"vtimepicker组件"},
        {url:"index/vdatepicker", text:"vdatepicker组件"},
        {url:"index/vupload", text:"vupload组件"},
        {url:"index/vrate", text:"vrate组件"},
        {url:"index/vcolorpicker", text:"vcolorpicker组件"},
        {url:"index/vtransfer", text:"vtransfer组件"},
        {url:"index/vform", text:"vform组件"},
        {url:"index/vtable", text:"vtable组件"},
        {url:"index/vtag", text:"vtag组件"},
        {url:"index/vprocess", text:"vprocess组件"},
        {url:"index/vtree", text:"vtree组件"},
        {url:"index/vpagination", text:"vpagination组件"},
        {url:"index/vbadge", text:"vbadge组件"},
        {url:"index/vavatar", text:"vavatar组件"},
        {url:"index/valert", text:"valert组件"},
        {url:"index/vloading", text:"vloading组件"},
        {url:"index/vmessage", text:"vmessage组件"},
        {url:"index/vmessagebox", text:"vmessagebox组件"},
        {url:"index/vnotification", text:"vnotification组件"},
        {url:"index/vtabs", text:"vtabs组件"},
        {url:"index/vbreadcrumb", text:"vbreadcrumb组件"},
        {url:"index/vpageheader", text:"vpageheader组件"},
        {url:"index/vdropdown", text:"vdropdown组件"},
        {url:"index/vsteps", text:"vsteps组件"},
        {url:"index/vdialog", text:"vdialog组件"},
        {url:"index/vtooltip", text:"vtooltip组件"},
        {url:"index/vpopover", text:"vpopover组件"},
        {url:"index/vpopconfirm", text:"vpopconfirm组件"},
        {url:"index/vcard", text:"vcard组件"},
        {url:"index/vcollapse", text:"vcollapse组件"},
        {url:"index/vtimeline", text:"vtimeline组件"},
        {url:"index/vdivider", text:"vdivider组件"},
        {url:"index/vcalendar", text:"vcalendar组件"},
        {url:"index/vimage", text:"vimage组件"},
        {url:"index/vDatetimepicket", text:"vDatetimepicket组件"},
        {url:"index/vbacktop", text:"backtop组件"},
      ]
    };
  },
  methods: {
    jumpPath(url, event){
      // console.log(event.target)
      // console.log(event.currentTarget)
      //console.log(event)
      //console.log(event.$attrs.index)
      //console.log(url)
      console.log(this.$route.matched[0], this.$route.matched[1])
      console.log("path", this.$route.path)
      console.log("fullpath", this.$route.fullPath)
      console.log('meta name:', this.$route.meta.name)
      this.$router.push("/"+url)
    },
    onCollapse: function() {
      this.$store.commit("onCollapse");
    },
    toIndex: function(){
      this.$router.push({path:"/"});
    },
    handleOpen: function(key,keypath){
      //console.log("menu open, key= " + key+", keypath="+keypath)
    },
    handleClose: function(key, keypath){
      //console.log("menu open, key= " + key+", keypath="+keypath)
    }
  },
  watch: {
  
  },
  computed: {
    ...mapState({
      appName: state => state.app.appName,
      collapse: state => state.app.collapse
    })
  }
};
</script>

<style scoped lang="scss">
.menu-bar-container {
  top: 0px;
  left: 0;
  bottom: 0;
  z-index: 1020;
  .logo {
    top: 0px;
    height: 60px;
    line-height: 60px;
    cursor: pointer;
    img {
      width: 40px;
      height: 40px;
      border-radius: 0px;
      margin: 10px 10px 10px 10px;
      float: left;
    }
    div {
      font-size: 22px;
      text-align: left;
    }
  }
  .icon-class{
    vertical-align: middle;
    margin-right: 5px;
    width: 24px;
    text-align: center;
    font-size: 18px;
  }
}
a {
  outline: 0;
}
.toggle {
  float: left;
  margin: 0;
  width: 60px;
  height: 60px;
}
.toggle a {
  padding: 15px 15px 0;
  cursor: pointer;
  display: block;
}
.toggle a i {
  font-size: 30px;
}
.el-header {
  padding: 0;
  background-color: #b3c0d1;
  color: #333;
  text-align: right;
}
.position-left {
  width: 200px;
}
.position-collapse-left {
  width: 65px;
}
</style>
