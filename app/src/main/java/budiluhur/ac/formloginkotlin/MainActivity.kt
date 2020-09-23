package budiluhur.ac.formloginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_login.setOnClickListener(this)

    }

    private fun validate(): Boolean {
        if (user.text.toString().isEmpty()) {
            user.error = "Username Tidak Boleh Kosong"
            return false
        } else if (password.text.toString().isEmpty()) {
            password.error = "Password Tidak Boleh Kosong"
            return false
        }
        return true
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_login->{
            if(validate()){
                Toast.makeText(applicationContext,"Berhasil",Toast.LENGTH_SHORT).show()
            }
            }
        }
    }
}
