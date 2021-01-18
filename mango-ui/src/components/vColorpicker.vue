<template>
    <div>
        <el-row>
            <el-col :span="4" :offset="1">
                <span>有默认值</span>
                <el-color-picker v-model="value1"></el-color-picker>
            </el-col>

            <el-col :span="4" :offset="1">
                <span>无默认值</span>
                <el-color-picker v-model="value2"></el-color-picker>
            </el-col>

            <el-col :span="4" :offset="1">
                <el-color-picker v-model="value3" show-alpha></el-color-picker>
            </el-col>
        </el-row>
    </div>    
</template>

<script>
export default {
    name: 'colorpicker',
    data(){
        return {
            value1:'#409EFF',
            value2:null,
            value3:null,
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
