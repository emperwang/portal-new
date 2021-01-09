<template>
  <div>
    <h2>Home Package</h2>
    <el-button type="primary" @click="testAxios1()">testAxios</el-button>
    <el-button type="primary" @click="getUser()">testAxiosUser</el-button>
    <el-button type="primary" @click="getMenu()">testAxiosMenu</el-button>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "Home",
  methods: {
    testAxios1() {
      axios.get("http://localhost:8080").then(res => alert(res.data));
    },
    getUser() {
      axios
        .get("http://localhost/8080/user")
        .then(res => alert(JSON.stringify(res.data)));
    },
    getMenu() {
      axios
        .get("http://localhost:8080/menu")
        .then(res => alert(JSON.stringify(res.data)));
    }
  }
};
</script>

<style scoped></style>
