import smtplib

from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

email = input("Enter Sender email: ")
pwd = input("Enter password: ")
to = input("Enter Receiver email: ")

subject = "This is the subject"
HTML = """\
    <html>
        <body>
            <p>Visit <a href="https://www.naver.com">Naver</a> </p>
        </body>
    </html>
    """



msg = MIMEMultipart('alternative')
msg['From'] = email
msg['To'] = to
msg['Subject'] = subject


msg.attach(MIMEText(HTML, 'html'))

server = smtplib.SMTP('smtp.gmail.com')
server.starttls()
server.login(email, pwd)
text = msg.as_string()
server.sendmail(email, to, text)
server.quit()
