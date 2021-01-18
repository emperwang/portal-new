<template>
    <div>
        <div>
            <el-dropdown>
                <span class="dropdown-link">下拉菜单
                    <i class="el-icon-arrow-down"></i>
                </span>

                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item>黄金糕</el-dropdown-item>
                    <el-dropdown-item>狮子头</el-dropdown-item>
                    <el-dropdown-item>螺蛳粉</el-dropdown-item>
                    <el-dropdown-item disabled>双皮奶</el-dropdown-item>
                    <el-dropdown-item divided>蚵仔煎</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </div>

        <div class="top">
            <el-dropdown>
                <el-button type="primary">更多菜单
                    <i class="el-icon-arrow-down"></i>
                </el-button>
                <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item>黄金糕</el-dropdown-item>
                    <el-dropdown-item>狮子头</el-dropdown-item>
                    <el-dropdown-item>螺蛳粉</el-dropdown-item>
                    <el-dropdown-item>双皮奶</el-dropdown-item>
                    <el-dropdown-item>蚵仔煎</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </div>

        <div class="top">
            <el-dropdown split-button type="primary" trigger="hover">
                更多菜单
                 <el-dropdown-menu slot="dropdown">
                    <el-dropdown-item>黄金糕</el-dropdown-item>
                    <el-dropdown-item>狮子头</el-dropdown-item>
                    <el-dropdown-item>螺蛳粉</el-dropdown-item>
                    <el-dropdown-item>双皮奶</el-dropdown-item>
                    <el-dropdown-item>蚵仔煎</el-dropdown-item>
                </el-dropdown-menu>
            </el-dropdown>
        </div>
    </div>    
</template>

<script>
export default {
    name:'vdropdown',
    data(){
        return {

        }
    },
    methods: {

    }
}
</script>

<style lang="scss" scoped>
.top {
    margin-top: 50px;
}
.dropdown-link{
    cursor: pointer;
    color: #409eff;
}
</style>
