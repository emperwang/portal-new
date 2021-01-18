<template>
    <div>
        <el-row :gutter="40">
            <el-col :span="4">
                <span>默认</span>
                <el-date-picker
                v-model="value1"
                type="date"
                placeholder="选择日期"
                ></el-date-picker>
            </el-col>

            <el-col :span="4">
                <span>带快捷键选项</span>
                <el-date-picker
                    v-model="value2"
                    align="right"
                    type="date"
                    placeholder="选择日期"
                    :picker-options="pickerOptions"
                ></el-date-picker>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="4">
                <span>周</span>
                <el-date-picker
                    v-model="value3"
                    type="week"
                    format="yyyy 第WW周"
                    placeholder="请选择周"
                ></el-date-picker>
            </el-col>
            <el-col :span="4" :offset="2">
                <span>月</span>
                <el-date-picker
                    v-model="value4"
                    type="month"
                    placeholder="选择月"
                ></el-date-picker>
            </el-col>
            <el-col :span="4" :offset="2">
                <span>年</span>
                <el-date-picker
                    v-model="value5"
                    type="year"
                    placeholder="选择年"
                ></el-date-picker>
            </el-col>
            <el-col :span="4" :offset="2">
                <span>多个日期</span>
                <el-date-picker
                    v-model="value6"
                    type="dates"
                    placeholder="选择一个或多个日期"
                ></el-date-picker>
            </el-col>
        </el-row>

        <el-row>
            <el-col :span="8">
                <el-date-picker
                v-model="value7"
                type="daterange"
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
    name: 'datepicker',
    data(){
        return {
            pickerOptions: {
                disabledDate(time){
                    return time.getTime > Date.now();
                },
                shortcuts: [
                    {
                        text:"今天",
                        onClick(picker) {
                            picker.$emit('pick', new Date());
                        }
                    },
                    {
                        text:'昨天',
                        onClick(picker){
                            const date = new Date();
                            date.setTime(date.getTime() - 3600*1000*24);
                            picker.$emit('pick', date);
                        }
                    },
                    {
                        text: '一周前',
                        onClick(picker){
                            const date = new Date();
                            date.setTime(date.getTime() - 3600 * 1000*24*7);
                            picker.$emit('pick', date);
                        }
                    }
                ]
            },
            value1:'',
            value2:'',
            value3:'',
            value4:'',
            value5:'',
            value6:'',
            value7:''
        }
    }
}
</script>

<style lang="scss" scoped>

</style>