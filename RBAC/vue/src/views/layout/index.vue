<template>
  <el-container>
    <div class="menu-bar-container" :style="{'background-color':themeColor}">
      <div :class="collapse ? 'position-collapse-left' : 'position-left'">
        <div class="logo" @click="toIndex()"
          :class="collapse ? 'position-collapse-left' : 'position-left'"
        >
          <img v-if="collapse" src="../../assets/logo.png" />
          <div>{{ collapse ? "" : appName }}</div>
        </div>
        <el-menu :collapse="collapse" :unique-opened="true" @open="handleOpen" @close="handleClose"
        :collapse-transition="false" :background-color="themeColor"
        >
          <el-menu-item index="/">
            <i class="el-icon-s-home"></i>
            <span slot="title">首页</span>
          </el-menu-item>
          <menuTree :menuList="menuList"></menuTree>
          
        </el-menu>
      </div>
    </div>

    <el-container>
      <el-header :style="{'background-color':themeColor}">
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
import menuTree from '../menu/menuTree';
export default {
    name:'index',
    data(){
        return{
          menuList: {}
        }
    },
    components:{
      menuTree
    },
    methods:{
        jumpPath(url, event){
        this.$router.push("/"+url)
        },
        onCollapse: function() {
        this.$store.commit("app/onCollapse");
        },
        toIndex: function(){
        this.$router.push({path:"/"});
        },
        handleOpen: function(key,keypath){
        //console.log("menu open, key= " + key+", keypath="+keypath)
        },
        handleClose: function(key, keypath){
        //console.log("menu open, key= " + key+", keypath="+keypath)
        },
        async getMenuList(){
          const res = await this.$http.get('menu/tree');
          console.log(res)
          if(res.status != 200 && res.status != 201){
            return this.$message.error('获取菜单失败');
          }
          this.menuList = res.data;
          console.log(this.menuList)
        }
    },
  watch: {
  
  },
  computed: {
    ...mapState({
      appName: state => state.app.appName,
      collapse: state => state.app.collapse,
      themeColor: state => state.app.themeColor,
    })
  },
  created() {
    this.getMenuList();
  }
}
</script>
<style lang="scss">
.el-container {
  height: 100%;
}
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
