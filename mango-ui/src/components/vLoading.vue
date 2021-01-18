<template>
    <div>
        <el-table
            v-loading="loading"
            :data="tableData"
        >
            <el-table-column
                prop="data"
                label="日期"
                width="180"
            ></el-table-column>
            <el-table-column
                prop="name"
                label="姓名"
                width="180"
            ></el-table-column>
            <el-table-column
                prop="address"
                label="地址"
                width="180"
            ></el-table-column>
        </el-table>
    </div>
</template>

<script>
export default {
    name: 'vloading',
    data() {
        return{
            loading: true,
            tableData:[{
                data: '2016-05-03',
                name:'name-w',
                address: '1519号'
            },{
                data: '2016-05-04',
                name:'name-k',
                address: '1520号'
            }],
        }
    },
    methods:{

    }
}
</script>

<style lang="scss" scoped>
body {
    margin: 0;
}
</style>
