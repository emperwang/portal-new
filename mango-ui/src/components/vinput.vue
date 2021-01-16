<template>
    <div>
        <el-row :gutter="20">
            <el-col :span="4">
                <el-input v-model="input1" placeholder="please input your name"></el-input>
            </el-col>
            <el-col :span="4">
                <el-input clearable v-model="input1" placeholder="Please input your name"></el-input>
            </el-col>
            <el-col :span="4">
                <el-input clearable v-model="password" placeholder="password" show-password></el-input>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="4">
                属性方式:
            </el-col>
            <el-col :span="4">
                <el-input placeholder="input date" suffix-icon="el-icon-date" v-model="input1"></el-input>
            </el-col>
            <el-col :span="4">
                <el-input placeholder="input content" prefix-icon="el-icon-search"></el-input>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="4">
                slot方式:
            </el-col>
            <el-col :span=4>
                <el-input placeholder="select date" v-model="input1">
                    <i slot="suffix" class="el-input__icon el-icon-date"></i>
                </el-input>
            </el-col>
            <el-col :span="4">
                <el-input placeholder="select content" v-model="input1">
                    <i slot="prefix" class="el-input__icon el-icon-search"></i>
                </el-input>
            </el-col>
        </el-row>

        <el-row :gutter="10">
                <el-col :span="4">
                    <el-input placeholder="input content" v-model="input1">
                        <template slot="prepend">Https://</template>
                    </el-input>
                </el-col>
                <el-col :span="4">
                    <el-input placeholder="input content" v-model="input1">
                        <template slot="append">.com</template>
                    </el-input>
                </el-col>
                <el-col :span="8">
                    <el-input placeholder="input content" v-model="input2">
                        <el-select v-model="select" slot="prepend" placeholder="please select">
                            <el-option label="餐厅名" value="1"></el-option>
                            <el-option label="订单号" value="2"></el-option>
                            <el-option label="用户电话" value="3"></el-option>
                        </el-select>
                        <el-button slot="append" icon="el-icon-search"></el-button>
                    </el-input>
                </el-col>
        </el-row>
    </div>
</template>

<script>
export default {
    name:"vinput",
    data(){
        return {
            input1:'',
            input2:'',
            password: '',
            select:''
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
.el-select{
    width: 100px;
}

</style>
