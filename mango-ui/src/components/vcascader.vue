<template>
    <div>
       <el-row :gutter="10">
           <el-col :span="4">
                <el-cascader v-model="value"
                    :options="options"
                    clearable
                    :show-all-levels="false"
                    @change="hangdleChange"></el-cascader>
           </el-col>
           <el-col :span="4">
                <el-cascader v-model="value"
                :options="options"
                :props="{expandTrigger:'hover'}"
                @change="hangdleChange"></el-cascader>
           </el-col>
           <el-col :span="4">
               <el-cascader v-model="value"
                :options="options"
                :props="props"
                @change="hangdleChange"></el-cascader>
           </el-col>
       </el-row>
    </div>
</template>

<script>
export default {
    name: "vcascader",
    data(){
        return {
            props:{
                multiple:true,
                checkStrictly: true
                },
            value: [],
            options:[{
                value: 'zhinan',
                label: '指南',
                children:[{
                    value: 'shejiyuanze',
                    label:'设计原则',
                    children:[{
                        value:'yizhi',
                        label:'一致'
                    },
                    {
                        value:'fankui',
                        label:'反馈'
                    },{
                        value:'xiaolv',
                        label:'效率'
                    }]
                }]
            },
            {
                value:'daohang',
                label:'导航',
                children:[{
                    value: 'cexiangdaohang',
                    label:'侧向导航'
                },{
                    value:'dingbudaohang',
                    label:'顶部导航'
                }]
            }]    
        }
    },
    methods:{
        handleChange(value){
            console.log(value)
        }
    }
}
</script>

<style lang="scss">
.el-row {
    margin-bottom: 20px;
    &:last-child {
        margin-bottom: 0;
    }
}

</style>