<template>
    <div>
        <el-row :gutter="20">
            <el-col :span="12">
                <el-radio v-model="radio" label="1">备选项1</el-radio>
            </el-col>
            <el-col :span="12">
                <el-radio v-model="radio" label="2">备选项2</el-radio>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col>
                <el-radio-group v-model="radio">
                    <el-radio :label="3">选项3</el-radio>
                    <el-radio :label="4">选项4</el-radio>
                    <el-radio :label="5">选项5</el-radio>
                </el-radio-group>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="6">
                <el-radio-group v-model="radio1">
                    <el-radio-button label="上海"></el-radio-button>
                    <el-radio-button label="北京"></el-radio-button>
                    <el-radio-button label="广州"></el-radio-button>
                    <el-radio-button label="深圳"></el-radio-button>
                </el-radio-group>
            </el-col>
            <el-col :span="6">
                <el-radio-group v-model="radio2" size="mini">
                    <el-radio-button label="上海"></el-radio-button>
                    <el-radio-button label="北京"></el-radio-button>
                    <el-radio-button label="广州"></el-radio-button>
                    <el-radio-button label="深圳"></el-radio-button>
                </el-radio-group>
            </el-col>
            <el-col :span="6">
                <el-radio-group v-model="radio3">
                    <el-radio label="3" border>选项3</el-radio>
                    <el-radio label="4" border>选项4</el-radio>
                </el-radio-group>
            </el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name: "vradio",
    data(){
        return {
            radio: "1",
            radio1: '上海',
            radio2: '上海',
            radio3: '3',
            radio4: '4'
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

