<template> 
    <div>
      <el-carousel height="460px" type="card" :interval="4000">
          <el-carousel-item v-for="(item,index) in list_img" :key="index">
                <h3 class="small">
                  <img :src="item.url" alt="">
                </h3>
          </el-carousel-item>
      </el-carousel>
    </div>
</template>

<script>
export default {
  name: "carousels",
  data() {
    return {
      list_img: [
        { url: require("../assets/1.jpeg") },
        { url: require("../assets/2.jpeg") },
        { url: require("../assets/3.jpeg") }
      ]
    };
  }
};
</script>

<style lang="scss" scoped></style>
