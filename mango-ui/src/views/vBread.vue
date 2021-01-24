<template>
    <div>
        <el-breadcrumb separator="/">
       <el-breadcrumb-item :to="{path:'/'}">首页</el-breadcrumb-item>
       <el-breadcrumb-item v-for="(itm, index) in $route.meta" :key="index" :to="{path: itm.path}">{{itm.name}}</el-breadcrumb-item>
    </el-breadcrumb>
    </div>
</template>

<script>
export default {
    name: 'vbread',
    data(){
        return {

        }
    },
    methods: {

    }
}
</script>

<style lang="scss" scoped>

</style>

