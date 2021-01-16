<template>
    <div>
        <el-row :gutter="10">
            <el-col :span="4">
                <el-switch v-model="v1" active-color="#13ce66" inactive-color="#ff4949"></el-switch>
            </el-col>
            <el-col :span="4">
                <el-switch v-model="v1" 
                active-text="按月付费"
                inactive-text="按年付费"
                ></el-switch>
            </el-col>
            <el-col :span="4">
                <el-switch v-model="v1" 
                active-text="按月付费"
                inactive-text="按年付费"
                active-color="#13ce66" 
                inactive-color="#ff4949"
                ></el-switch>
            </el-col>
            <el-col :span="4"></el-col>
            <el-col :span="4"></el-col>
            <el-col :span="4"></el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name:"vswitch",
    data(){
        return {
            v1:true,
            v2:false
        }
    }
}
</script>

<style lang="scss" scoped>
.el-row{
    margin-bottom: 20px;
    &:last-child {
        margin-bottom: 0;
    }
}
</style>