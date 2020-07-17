package by.vladislavpopkov.dagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var car2: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var create = DaggerApplicationComponent.factory().create(this)
        var create1 = DaggerApplicationComponent.factory().create(this)
        (application as MyApplication).appComponent.inject(this)
        hello.setText(car.fuelType)

    }
}
