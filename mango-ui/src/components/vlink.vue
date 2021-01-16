<template>
    <div>
        <el-row :gutter="20">
            <el-col :span="4">
                <el-link href="#">默认链接</el-link>
            </el-col>
            <el-col :span="4">
                <el-link type="primary">主要链接</el-link>        
            </el-col>
            <el-col :span="4">
                <el-link type="success">成功链接</el-link>        
            </el-col>
            <el-col :span="4">
                <el-link type="warning">警告链接</el-link>        
            </el-col>
            <el-col :span="4">
                <el-link type="danger">危险链接</el-link>        
            </el-col>
            <el-col :span="4">
                <el-link type="info">信息链接</el-link>        
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="12">
                <el-link type="primary" href="#" underline>下划线</el-link>
            </el-col>
            <el-col :span="12">
                <el-link type="danger" href="#" :underline="false">无下划线</el-link>
            </el-col>
        </el-row>

        <el-row :gutter="20">
            <el-col :span="12">
                <el-link type="primary" href="#" icon="el-icon-edit">编辑</el-link>
            </el-col>
            <el-col :span="12">
                <el-link type="success" href="#" icon="el-icon-view">查看</el-link>
            </el-col>
        </el-row>
    </div>    
</template>

<script>
export default {
    
}
</script>

<style lang="scss" scoped>

</style>
