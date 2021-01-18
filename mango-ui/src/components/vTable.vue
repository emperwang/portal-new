<template>
    <div>
        <div>
            <el-table :data="tabData" stripe border>
                <el-table-column prop="date" label="日期" width="180"></el-table-column>
                <el-table-column prop="name" label="姓名" width="180"></el-table-column>
                <el-table-column prop="address" label="地址" width="180"></el-table-column>
            </el-table>
        </div>
    </div>    
</template>
<script>
export default {
    name:'vtable',
    data(){
        return{
            tabData: [{
                date:'2016-05-02',
                name: '小胡',
                address:'上海市1518号'
            },{
                date:'2016-05-03',
                name: '小胡1',
                address:'上海市1519号'
            },{
                date:'2016-05-04',
                name: '小胡2',
                address:'上海市1520号'
            }]
        }
    }
}
</script>
<style lang="scss" scoped>

</style>
