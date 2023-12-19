
$probNum = '_' + $args[0]
# exec, folder, extension
# {lang(folder) = [execute command, file extension]} ex) {python : [python, py]}
$languages = @{ 'python' = @('python', 'py'); 'java' = @('java', 'java'); 'javascript' = @('node', 'js') }

Write-Output "Running problem $probNum"
foreach ($lang in $languages.Keys) {
    $Folder = './' + $probNum + '/' + $lang
    if (Test-Path -Path $Folder) {
        Write-Output ""
        Write-Output "=============$lang Exec Result============="
        $ScriptFile = './' + ${probNum} + '/' + ${lang} + '/run.' + $languages[$lang][1]
        powershell -command $languages[$lang][0] $ScriptFile
        Write-Output "============================================"
    }
    else {
        "$Folder Script Not exist."
    }
}
