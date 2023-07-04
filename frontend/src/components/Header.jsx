import headerStyles from './Header.module.css';

import logo from '../assets/logo.svg';

export function Header() {
  return (
    <header className={headerStyles.header}>
      <img src={logo} alt="Logotipo" />
    </header>
  );
}