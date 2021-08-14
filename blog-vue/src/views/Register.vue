<template>
  <div class="register-warpper">
    <el-form ref="registerForm" :model="form" :rules="rules" label-width="80px" class="register-box">
      <h3 class="register-title">博客注册</h3>
      <el-form-item label="账号" prop="username">
        <el-input type="text" placeholder="请输入账号" v-model="form.username"/>
      </el-form-item>
      <el-form-item label="密码" prop="password">
        <el-input type="password" placeholder="请输入密码" v-model="form.password"/>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="submitRegister()">注册</el-button>
      </el-form-item>
    </el-form>

    <el-dialog title="温馨提示" :visible.sync="dialogVisible" width="30%">
      <span>{{ msg }}</span>
      <span slot="footer" class="dialog-footer">
            <el-button type="primary" @click="dialogVisible = false">确 定</el-button>
        </span>
    </el-dialog>
  </div>
</template>

<script>
import {register} from "../api/login";

export default {
  name: "register",
  data() {
    return {
      form: {
        username: '',
        password: ''
      },
      msg: '',
      // 表单验证，需要在 el-form-item 元素中增加 prop 属性
      rules: {
        username: [{
          required: true,
          message: '账号不可为空',
          trigger: 'blur'
        }],
        password: [{
          required: true,
          message: '密码不可为空',
          trigger: 'blur'
        }]
      },

      // 对话框显示和隐藏
      dialogVisible: false
    }
  },
  methods: {
    async submitRegister() {
      let _this = this;
      register(_this.form).then(res => {
        if (res.data.code === 200) {
          // const token = res.data.data.token
          // const userId = res.data.data.userDetail.id
          // sessionStorage.setItem('user_token', token)
          // sessionStorage.setItem('user_id', userId)
          this.$router.push("/blog/login");
        } else {
          this.msg = res.data.msg;
          this.dialogVisible = true;
          return false;
        }
      }).catch(error => {
        alert('账号或密码错误');
        console.log(error);
      });
    }
  },
  created() {
    var that = this;
    document.onkeydown = function () {
      var key = window.event.keyCode;
      if (key == 13 || key == 100) {
        that.submitRegister();
      }
    }
  }
}
</script>

<style>
.register-warpper {
  position: absolute;
  background-color: #324057;
  height: 100%;
  width: 100%;
}

.register-box {
  border: 1px solid #DCDFE6;
  width: 350px;
  margin: 15% auto;
  padding: 35px 35px 15px 35px;
  border-radius: 5px;
  -webkit-border-radius: 5px;
  -moz-border-radius: 5px;
  box-shadow: 0 0 25px #909399;
  background: #efefef;
}

.register-title {
  text-align: center;
  margin: 0 auto 40px auto;
  color: #303133;
}
</style>
