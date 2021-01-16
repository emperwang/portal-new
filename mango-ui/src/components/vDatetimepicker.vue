<template>
    <div>
        <el-row>
            <el-col :span="4">
                <el-date-picker
                    v-model="value1"
                    type="datetime"
                    placeholder="选择日期时间"
                ></el-date-picker>
            </el-col>

            <el-col :span="4" :offset=1>
                <el-date-picker
                v-model="value2"
                type="datetimerange"
                range-separator="至"
                start-placeholde="开始日期"
                end-placeholde="结束日期"
                ></el-date-picker>
            </el-col>
        </el-row>
    </div>    
</template>
<script>
export default {
    name: 'vdatetimepicker',
    data(){
        return {
            value1:'',
            value2:'',
            value3:'',
            value4:'',
            value5:''
        }
    }
}
</script>

<style lang="scss" scoped>

</style>
