<template>
    <div>
        <el-row :gutter="10">
            <el-col :span="4" :offset="2">
                    <el-time-select
                    v-model="value"
                    :picker-options="{start:'08:30', step:'00:15',end:'18:30'}"
                    placeholder="请选择时间"
                    ></el-time-select>
            </el-col>


            <el-col :span="4" :offset="2">
                <span>滚动设置</span>
                <el-time-picker
                    v-model="value"
                    :picker-options="{selectableRange: '18:30:00 - 20:30:00'}"
                    placeholder="请选择时间"
                ></el-time-picker>
            </el-col>

            <el-col :span="4" :offset="2">
                <el-time-picker
                    v-model="value"
                    arrow-control
                    :picker-options="{selectableRange:'18:30:00 - 20:30:00'}"
                ></el-time-picker>
            </el-col>

        </el-row> 


    </div>    
</template>

<script>
export default {
    name:"timepciker",
    data() {
        return {
            value: ''
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
