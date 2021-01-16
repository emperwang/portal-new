<template>
    <div>
        <el-row :gutter="10">
            <el-col :span="4">
                <el-select v-model="select1" placeholder="选择你喜欢的事物">
                    <el-option v-for="item in options"
                    :key="item.val1" :label="item.label" :value="item.val1"></el-option>
                </el-select>
            </el-col>

            <el-col :span="4">
                <el-select clearable v-model="select2" placeholder="选择你喜欢的事物">
                    <el-option v-for="item in options"
                    :key="item.val1" :label="item.label" :value="item.val1"></el-option>
                </el-select>
            </el-col>

            <el-col :span="4">
                <el-select multiple v-model="select3" placeholder="选择你喜欢的事物">
                    <el-option v-for="item in options"
                    :key="item.val1" :label="item.label" :value="item.val1"></el-option>
                </el-select>
            </el-col>

            <el-col :span="4">
                <el-select multiple collapse-tags v-model="select4" placeholder="选择你喜欢的事物">
                    <el-option v-for="item in options"
                    :key="item.val1" :label="item.label" :value="item.val1"></el-option>
                </el-select>
            </el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name: "vselect",
    data(){
        return {
            select1:'',
            select2:'',
            select3: '',
            select4:'',
            options: [
                {val1:"1", label:"黄金糕"},
                {val1:"2", label:"双皮奶"},
                {val1:"3", label:"龙须面"},
                {val1:"4", label:"烤腰子"},
            ]
        }
    }
}
</script>
<style lang="scss" scoped>
.el-row {
    margin-bottom: 20px;
    &:last-child{
        margin-bottom: 0;
    }
}
</style>
