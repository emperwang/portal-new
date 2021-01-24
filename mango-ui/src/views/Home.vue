<template>
  <div>
    <h2>Home Package</h2>
    <el-button type="primary" @click="getUser()">testAxiosUser</el-button>
    <el-button type="primary" @click="getMenu()">testAxiosMenu</el-button>
  </div>
</template>

<script>
// import axios from "axios";
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
  }
};
</script>

<style scoped></style>
