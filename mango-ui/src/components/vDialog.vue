<template>
    <div>
        <div>
        <el-button type="primary" @click="dialogVisible=true">打开dialog</el-button>
        <el-dialog 
            title="提示"
            :visible.sync=dialogVisible
            width="30%"
            :before-close="handleClose"
        >
            <el-input v-model="value1" type="primary"></el-input>
            <span slot="footer">
                <el-button @click="dialogVisible=false">取消</el-button>
                <el-button type="primary" @click="dialogVisible=false">确定</el-button>
            </span>
        </el-dialog>
        </div>

        <div class="top">
            <!-- table -->
            <el-button type="primary" @click="dialogVisible1=true">
                表格dialog
            </el-button>

            <el-dialog
                title="收获地址"
                :visible.sync=dialogVisible1>
                <el-table :data="gridData">
                    <el-table-column property="date" label="日期" width="150"></el-table-column>
                    <el-table-column property="name" label="姓名" width="200"></el-table-column>
                    <el-table-column property="address" label="地址"></el-table-column>
                </el-table>    
            </el-dialog>
        </div>

        <div class="top">
            <!-- form -->
            <el-button type="primary" @click="dialogVisible2=true">
                嵌套表单的dialog
            </el-button>

            <el-dialog title="收获地址" :visible.sync="dialogVisible2">
                <el-form :model="form">
                    <el-form-item label="活动名称" :label-width="formLabelWidth">
                        <el-input v-model="form.name"></el-input>
                    </el-form-item>
                    <el-form-item label="活动区域" label-width="formLabelWidth">
                        <el-select v-model="form.region" placeholder="请选择活动区域">
                            <el-option label="区域一" value="shanghai"></el-option>
                            <el-option label="区域二" value="beijing"></el-option>
                        </el-select>
                    </el-form-item>
                </el-form>

                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialogVisible2=false">取消</el-button>
                    <el-button @click="dialogVisible2=false">确认</el-button>
                </div>
            </el-dialog>
        </div>

        <div class="top">
            <!-- nest dialog -->
            <el-button type="primary" @click="dialogVisible3=true">打开外层dialog</el-button>
            <el-dialog title="外层dialog" :visible.sync="dialogVisible3">
                <el-dialog width="30%" title="内层dialog" :visible.sync="dialogVisible4"
                    append-to-body
                ></el-dialog>
            
            <div slot="footer" class="dialog-footer">
                <el-button @click="dialogVisible3=false">取消</el-button>
                <el-button @click="dialogVisible4=true">打开内层嵌套dialog</el-button>
            </div>
            </el-dialog>
        </div>
    </div>
</template>

<script>
export default {
    name: 'dialog',
    data(){
        return {
            dialogVisible:  false,
            dialogVisible1: false,
            dialogVisible2: false,
            dialogVisible3: false,
            dialogVisible4: false,
            value1: '',
            gridData:[{
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
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
            }],
            form: {
                name:'',
                region:'',
            },
            formLabelWidth: '120px'
        }
    }, 
    methods:{
        handleClose(done){
            this.$confirm('确认关闭')
            .then(_ => {
                done();
            }).catch(_ => {})
        }
    }
}
</script>

<style lang="scss" scoped>
.top {
    margin-top: 30px;
}
</style>