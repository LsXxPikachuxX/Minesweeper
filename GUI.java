//Currently learning how to do this. Will post finished file/files.
using System.Windows.Forms;
  
class MyFirstForm : Form
{
    public MyFirstForm()
    {
         this.Text = "My First Form";
    }
}
    
class MyFirstApp
{
     static void Main()
     {
          Form form = new myFirstForm();
          Application.Run(form);
     }
}
