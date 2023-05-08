
def buildApp(){
    echo "This is Build stage in feature branch"
}

def testApp(){
    echo "This is test stage in feature branch"
}

def deployApp(){
    echo "This is deploy stage in feature branch"
}

def prodApp(){
    echo "This is Production stage in feature branch"
}

return this