
PROB_NUM = '_' + $1

echo "Running problem $1"

# Run a Python Script if exists .$probNum/python/$probNum.py
FOLDER = './' + $PROB_NUM + '/python'

if [-d "$FOLDER"]; then 
    echo ""
    echo "=============Python Exec Result============="
    $pythonStartTime = Get-Date
    python ./${PROB_NUM}/python/run.py
    $pythonEndTime = Get-Date

    $pythonExecTime = $pythonEndTime.Millisecond - $pythonStartTime.Millisecond
    echo "Execute Time : $pythonExecTime ms"
    echo "============================================"

else 
    "$Folder Python Script Not exist."
fi

# Run a Java Script if exists .$probNum/python/$probNum.java
FOLDER = './' + $PROB_NUM + '/java'

if [ -d $FOLDER ]; then 
    echo ""
    echo "=============Java Exec Result============="
    $javaStartTime = Get-Date
    java ./${PROB_NUM}/java/run.java
    $javaEndTime = Get-Date

    $javaExecTime = $javaEndTime.Millisecond - $javaStartTime.Millisecond
    echo "Execute Time : $javaExecTime ms"
    echo "============================================"

else 
    "$Folder Java Script Not exist."
fi
