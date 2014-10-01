Android Ryerson SDC
===================

Android tutorial workshop was built with the latest version of Android Studio. This project covers the basics including views and fragments, has a basic debugger showing when different [lifecycle methods](http://stackoverflow.com/a/8516056/1277651) are invoked (thanks for the idea [Ideae](https://github.com/Ideae/), and more. 

####Usage

Using the screens' bottom back button goes backward through each of the stacked frames. Using the screens' top bar back button exits all of them all at once. 

####Status

Session 1 had a version that when you clicked 10 times the button it caused another activity to appear, the Congratulations Activity.  In Session 3 we changed that to instead invoke some fragments, with a giant button.   FunkyFragment began to be implemented but is not.

####Lessons
One key stumbling block many people had was getting stuck on sizing views. To change the button height first it needs to be contained within a view such as ```[LinearLayout](http://developer.android.com/guide/topics/ui/layout/linear.html)```. The button can have an attribute of ```android:layout_width="33"```, but to function it's parent must have ```android:weightSum="99"```, that is a relative amount to reference.

####Images

![readme image][1]
![readme image][2]
![readme image][3]
![readme image][4]

  [1]: https://raw.githubusercontent.com/nastajus/AndroidRyersonSDC/master/README/README1.png
  [2]: https://raw.githubusercontent.com/nastajus/AndroidRyersonSDC/master/README/README2.png
  [3]: https://raw.githubusercontent.com/nastajus/AndroidRyersonSDC/master/README/README3.png
  [4]: https://raw.githubusercontent.com/nastajus/AndroidRyersonSDC/master/README/README4.png
  