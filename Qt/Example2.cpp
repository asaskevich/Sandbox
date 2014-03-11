#include <QApplication>
#include <QLabel>
#include <QFrame>
#include <QVBoxLayout>
#include <QWidget>
#include <QTextEdit>
#include <QPushButton>

// In Example2 we just create some widgets and add them into window
int main(int argc, char *argv[])
{
    // Creating basic controls
    QApplication app(argc, argv);
    QWidget *win = new QWidget;
    QLabel *label = new QLabel("Username:");
    QTextEdit *edit = new QTextEdit;
    QPushButton *button = new QPushButton("OK");
    QVBoxLayout *layout = new QVBoxLayout;
    // Change attributes
    win->setWindowTitle("Example2");
    edit->setToolTip("Enter here your username");
    // Add widgets to window
    layout->addWidget(label);
    layout->addWidget(edit);
    layout->addWidget(button);
    win->setLayout(layout);
    // Show window
    win->show();
    return app.exec();
}
