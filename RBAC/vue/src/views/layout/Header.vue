<template>
    <div>
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
    </div>
</template>

<script>
export default {
    name:'header',
    data(){
        return {

        }
    },
    methods: {
    onCollapse: function() {
      this.$store.commit("onCollapse");
    },
    }
}
</script>
<style lang="scss" scoped>
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
</style>
