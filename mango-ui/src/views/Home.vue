<template>
  <div>
    <vbread></vbread>
    <h2>Home Package</h2>
    <el-button type="primary" @click="getUser()">testAxiosUser</el-button>
    <el-button type="primary" @click="getMenu()">testAxiosMenu</el-button>
  </div>
</template>

<script>
// import axios from "axios";
import vbread from '@/views/vbread'
export default {
  name: "Home",
  methods: {
    getUser() {
      this.$http.get('user')
        .then(res => alert(JSON.stringify(res.data)));
    },
    getMenu() {
      this.$http.get('menu')
        .then(res => alert(JSON.stringify(res.data)));
    }
  },
  components: {
    vbread
  }
};
</script>

<style scoped></style>
