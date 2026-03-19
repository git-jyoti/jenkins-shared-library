// vars/helloWorld.groovy

// The 'call' method is what gets executed when you invoke the script's name
def call(String name = 'User') {
    // You can use standard Pipeline steps (echo, sh, etc.) inside this method
    echo "Hello, ${name}! Welcome to the Shared Library."
    
    def date = sh(script: 'date', returnStdout: true).trim()
    echo "The current date on the build node is: ${date}"
}