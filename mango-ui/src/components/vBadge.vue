<template>
    <div>
        <el-row>
            <el-col :span="2">
                <el-badge :value="12" class="item">
                    <el-button size="small">评论</el-button>
                </el-badge>
            </el-col>
            <el-col :span="2">
                <el-badge :value="1" class="item" type="primary">
                    <el-button size="small">评论</el-button>
                </el-badge>
            </el-col>
            <el-col :span="2">
                <el-badge :value="500" :max="99" class="item" type="warning">
                    <el-button size="small">回复</el-button>
                </el-badge>
            </el-col>
            <el-col :span="2">
                <el-dropdown trigger="click">
                    <span class="el-dropdown-link">
                        点我查看 <i class="el-icon-caret-bottom"></i>
                    </span>
                    <el-dropdown-menu slot="dropdown">
                        <el-dropdown-item class="clearfix">
                            评论
                            <el-badge class="mark" :value="12"></el-badge>
                        </el-dropdown-item>

                        <el-dropdown-item class="clearfix">
                            回复
                            <el-badge class="mark" :value="3"></el-badge>
                        </el-dropdown-item>
                    </el-dropdown-menu>
                </el-dropdown>

            </el-col>
            <el-col :span="2"></el-col>
        </el-row>
    </div>
</template>
<script>
export default {
    name: 'vbadge',
    data(){
        return {

        }
    }
}
</script>

<style lang="scss" scoped>
.item {
    margin-top: 10px;
    margin-right: 40px;
}
</style>