/*
 *    Copyright 2017 Muhammad Rifqi Fatchurrahman Putra Danar
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.muhrifqii.maos.ui.activities

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import butterknife.BindView
import butterknife.ButterKnife
import io.github.muhrifqii.maos.R
import io.github.muhrifqii.maos.viewmodels.MainViewModel

/**
 * Created on   : 21/01/17
 * Author       : muhrifqii
 * Name         : Muhammad Rifqi Fatchurrahman Putra Danar
 * Github       : https://github.com/muhrifqii
 * LinkedIn     : https://linkedin.com/in/muhrifqii
 */

class MainActivity : BaseActivity<MainViewModel>() {

  @BindView(R.id.main_bottom_nav_view)
  lateinit var bottomNav: BottomNavigationView

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    ButterKnife.bind(this)
    bottomNav.setOnNavigationItemSelectedListener {
      when(it.itemId){

      }
    }
  }

  override fun onDestroy() {
    super.onDestroy()
  }

  override fun viewModelClass(): Class<MainViewModel> {
    return MainViewModel::class.java
  }

  override fun finishActivityTransition(): Pair<Int, Int>? {
    return null
  }
}
