<template>
    <div>
        <el-tree :data='datas' :props="defaultProps"
           @node-click="handleNodeClick" 
        ></el-tree>
    </div>
</template>

<script>
export default {
    name: 'vtree',
    data(){
        return {
            defaultProps:{
                children: 'children',
                label:'label'
            },
            datas:[{
                label: '一级 1',
                children: [{
                    label:'二级 1-1',
                    children: [{
                        label:'三级 1-1-1'
                    }]
                }]
                },{
                    label:'一级 2',
                    children:[{
                        label: '二级 2-2',
                        children:[{
                            label: '三级 2-2-2'
                        }]
                    }]
                }
            ]
        }
    },
    methods: {
        handleNodeClick(data){
            console.log(data);
        }
    }
}
</script>

<style lang="scss" scoped>

</style>