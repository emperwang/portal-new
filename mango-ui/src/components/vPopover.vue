<template>
    <div>
        <div>
        <el-popover
            placement="top-start"
            title="标题"
            width="200"
            trigger="hover"
            content="这是一段内容"
        >
            <el-button slot="reference">hover激活</el-button>
        </el-popover>
        </div>

        <div>
            <el-popover
            placement="right"
            width="400"
            trigger="click"
            >
                <el-table :data="gridData">
                    <el-table-column width="150" prop="date" label="日期"></el-table-column>
                    <el-table-column width="150" prop="name" label="姓名"></el-table-column>
                    <el-table-column width="150" prop="address" label="地址"></el-table-column>
                </el-table>
                <el-button slot="reference">click 激活</el-button>
            </el-popover>
        </div>
    </div>
</template>

<script>
export default {
    name: 'vpopover',
    data(){
        return {
            gridData:[{
            date:'2016-05-02',
            name:'小胡',
            address:'1518'
            }, {
            date: '2016-05-04',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
            }, {
            date: '2016-05-01',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
            }, {
            date: '2016-05-03',
            name: '王小虎',
            address: '上海市普陀区金沙江路 1518 弄'
            }]
        }
    }, 
    methods:{
        
    }
}
</script>

<style lang="scss" scoped>

</style>