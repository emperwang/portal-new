<template>
    <div>
        <el-row :gutter="10">
            <el-col :span="4">
                <el-input-number :step="2" step-strictly v-model="num1" :min="1" :max="10" label="input content"></el-input-number>
            </el-col>
            <el-col :span="4">
                <el-input-number v-model="num1" controls-position="right"></el-input-number>
            </el-col>
            <el-col :span="4"></el-col>
            <el-col :span="4"></el-col>
            <el-col :span="4"></el-col>
            <el-col :span="4"></el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name: "vinputnumber",
    data(){
        return {
            num1:''
        }
    }
}
</script>

<style lang="scss" scoped>
.el-row{
    margin-bottom: 20px;
    &:last-child{
        margin-bottom: 0;
    }
}

</style>

