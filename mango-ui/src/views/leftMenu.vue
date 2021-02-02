<template>
    <el-container>
        <el-aside>
            <el-menu
                class="el-menu-vertical-demo"
                background-color="#545c64"
                text-color="#fff"
                active-text-color="#ffd04b">
            <navleft :dataList="dataList"></navleft>
            </el-menu>
        </el-aside>
    </el-container>
        
</template>

<script>
import menuList from '@/data/menuList';
import navleft from './NavLeft';
export default {
    name: "leftMenu",
    data() {
        return {
            dataList: menuList,
        }
    },
    components:{
        navleft
    },
    methods: {

    },
    created(){
        console.log(this.dataList)
    }
}
</script>

<style lang="scss" scoped>

</style>