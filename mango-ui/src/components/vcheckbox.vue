<template>
    <div>
        <el-row :gutter="20">
            <el-col :span="24" :offset="11">
                <el-checkbox v-model="checked">是否喜欢运动</el-checkbox>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="12" :offset="12">
                <el-checkbox-group v-model="checkList">
                    <el-checkbox label="A"></el-checkbox>
                    <el-checkbox label="B" checked></el-checkbox>
                    <el-checkbox label="C"></el-checkbox>
                    <el-checkbox label="必选" disabled></el-checkbox>
                </el-checkbox-group>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="12">
                <el-checkbox-group v-model="checkboxgroup1" size=mini>
                    <el-checkbox-button v-for="city in cities" :label="city" :key="city">{{city}}</el-checkbox-button>
                </el-checkbox-group>
            </el-col>

            <el-col :span="12">
                <el-checkbox-group v-model="checkboxgroup1" size="medium">
                    <el-checkbox-button v-for="city in cities" :label="city" :key="city">{{city}}</el-checkbox-button>
                </el-checkbox-group>
            </el-col>
        </el-row>
    </div>
</template>

<script>
    const cityOptions= ['上海','北京','杭州','深圳'];
export default {
    name: "vcheckbox",
    data(){
        return{
            checked: true,
            checkList: ['必选'],
            checkboxgroup1:['上海'],
            cities: cityOptions
        }
    }
}
</script>

<style lang="scss" scoped>
.el-row {
    margin-bottom: 20px;
    &:last-child {
        margin-bottom: 0;
    }
}
</style>
