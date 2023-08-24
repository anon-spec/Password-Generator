import secrets
import string
"""Project allows users to generate a password with character limits, numbers, and special characters"""


class password:

    def charLimit(value):
        """character limit"""
        if type(value) != int:
            raise Exception("{} must be an int".format(value))
        elif value <= 0:
            raise Exception("{} must be greater than zero".format(value))
        
        len(password) = len(value)


