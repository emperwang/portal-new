<template>
    <div>
        <div>
            <el-breadcrumb separator="/">
                <el-breadcrumb-item :to="{path:'/'}">首页</el-breadcrumb-item>
                <el-breadcrumb-item :to="{path: '/vtabs'}">tab页面</el-breadcrumb-item>
                <el-breadcrumb-item :to="{path:'/vbutton'}">btn页面</el-breadcrumb-item>
                <el-breadcrumb-item :to="{path: 'vloading'}">loading页面</el-breadcrumb-item>
            </el-breadcrumb>
        </div>

        <div style="margin-top: 50px">
            <el-breadcrumb separator-class="el-icon-arrow-right">
                <el-breadcrumb-item :to="{path:'/'}">首页</el-breadcrumb-item>
                <el-breadcrumb-item :to="{path: '/vtabs'}">tab页面</el-breadcrumb-item>
                <el-breadcrumb-item :to="{path:'/vbutton'}">btn页面</el-breadcrumb-item>
                <el-breadcrumb-item :to="{path: 'vloading'}">loading页面</el-breadcrumb-item>
            </el-breadcrumb>
        </div>
    </div>
</template>
<script>
export default {
    name:'vbreadcrumb',
    data(){
        return {
            levelList: null
        }
    },
    created() {
        this.getBreadcrumb()
    },
    watch: {
        $$route(){
            this.getBreadcrumb()
        }
    },
    methods:{
        getBreadcrumb(){
            let matchd = this.$route.matched.filter(item =>  {
                item.name
            })
            const first  = matchd[0]
            console.log(matchd)
            this.levelList = matchd
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
