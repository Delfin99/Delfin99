# Send Email by SMTP

# set sender information
$email = ""
$password = ""


# set receiver address
$receiverA = ""

$receivers = $receiverA


# set attachment
# $fileA = "/Users/jeong/Delfin99/Study/Powershell/smtp/Attachments/*.txt"
# Mac
$file = Get-ChildItem -Path "/Users/jeong/Delfin99/Study/Powershell/smtp/Attachments/" -Include "*" 
# Windows
# $file = Get-ChildItem -Path "C:/Users/Jeong/Delfin99/Delfin99/Study/Powershell/smtp/Attachments/" -Include "*" 


$files = $file.fullname

# email structure
function SendEmail {

	Write-Host "Sending Email"

	$smtpServer = "smtp.gmail.com"

	$message = New-Object Net.Mail.MailMessage

	$smtp = New-Object Net.Mail.SmtpClient($smtpServer)

	$smtp.EnableSSL = $true

	$message.From = "$email"

	foreach($to in $receivers) {
		$message.To.Add($to)
	}

	foreach($file in $files) {
		$message.Attachments.Add($file)
	}

	$message.Subject = "Sending Email by Powershell Script"
	$message.Body = "Hi Seungki,`n`nThis is an email for test by Powershell Script`n`nThanks`nSeungki Jeong`n`n`n`n"

	$smtp.Credentials = New-Object System.Net.NetworkCredential("$email", "$password")
	
	$smtp.Send($message)
}

# execution
try {
	SendEmail
	Write-Host "Sent!"
}
catch {
	Write-Host "Error"
}
